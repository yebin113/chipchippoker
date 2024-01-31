package com.chipchippoker.backend.common.dto;

import static org.springframework.http.HttpStatus.*;

import org.springframework.http.HttpStatusCode;

import lombok.Getter;

@Getter
public enum ErrorBase {
	/**
	 * 400 Bad Request (잘못된 요청)
	 */
	E400_INVALID(BAD_REQUEST, false, "BR000", "잘못된 요청입니다"),
	E400_INVALID_ENCODING_ID(BAD_REQUEST, false, "BR001", "잘못된 ID가 입력되었습니다"),
	E400_INVALID_AUTH_TOKEN(BAD_REQUEST, false, "BR002", "만료되거나 유효하지 않은 소셜 인증 토큰입니다"),
	E400_INVALID_UPLOAD_FILE_EXTENSION(BAD_REQUEST, false, "BR008", "잘못된 파일 확장자입니다"),
	E400_MISSING_PARAMETER(BAD_REQUEST, false, "BR100", "필수 파라미터가 입력되지 않았습니다"),
	E400_MISSING_MULTIPART(BAD_REQUEST, false, "BR101", "필수 멀티파트가 입력되지 않았습니다."),
	E400_MISSING_PATH_VARIABLE(BAD_REQUEST, false, "BR102", "필수 PathVariable이 입력되지 않았습니다."),
	E400_MISSING_AUTH_TOKEN_PARAMETER(BAD_REQUEST, false, "BR105", "인증 토큰을 입력해주세요"),
	E400_INVALID_TOKEN(BAD_REQUEST, false, "BR106", "유효하지 않은 토큰입니다"),
	E400_INVALID_PASSWORD(BAD_REQUEST, false, "BR107", "올바르지 않은 비밀번호입니다."),
	E400_INVALID_AUTHORIZATION_CODE(BAD_REQUEST, false, "BR108", "올바르지 않은 인가코드입니다."),
	E400_INVALID_NOT_READY(BAD_REQUEST, false, "BR109", "플레이어 전원이 준비를 해야 시작할 수 있습니다."),
	E400_INVALID_ALREADY_DIE(BAD_REQUEST, false, "BR110", "플레이어는 DIE 상태로 배팅에 참여할 수 없습니다."),
	E400_INVALID_ROUND_MISMATCH(BAD_REQUEST, false, "BR111", "라운드가 일치하지 않습니다."),
	E400_INVALID_BET_COIN(BAD_REQUEST, false, "BR112", "배팅이 불가능 한 개수의 코인입니다."),
	/**
	 * 401 UnAuthorized (인증 실패)
	 */
	E401_UNAUTHORIZED(UNAUTHORIZED, false, "UA000", "세션이 만료되었습니다. 다시 로그인 해주세요"),
	E401_UNAUTHORIZED_ACCESS_TOKEN(UNAUTHORIZED, false, "UA001", "access-token을 재발급 하였습니다. 다시 요청해 주세요"),
	E401_UNAUTHORIZED_ACCESS_TOKEN_NOT_EQUAL(UNAUTHORIZED, false, "UA002", "구독할 수 없는 메시지 큐입니다."),
	E401_UNAUTHORIZED_ACCESS_TOKEN_EXPIRED(UNAUTHORIZED, false, "UA003", "만료된 액세스 토큰입니다. 재발행 요청해 주세요"),
	E401_UNAUTHORIZED_REFRESH_TOKEN_EXPIRED(UNAUTHORIZED, false, "UA004", "만료된 리프레쉬 토큰입니다. 재로그인 해주세요"),

	/**
	 * 403 Forbidden (권한 등의 이유로 허용하지 않는 요청)
	 */
	E403_FORBIDDEN(FORBIDDEN, false, "FB000", "허용하지 않는 요청입니다"),
	E403_INVALID_GAME_ROOM_PASSWORD(FORBIDDEN, false, "FB001", "비밀번호가 틀렸습니다."),
	E403_ALREADY_FULL_GAME_ROOM(FORBIDDEN, false, "FB002", "인원 수가 초과했습니다."),
	E403_ALREADY_STARTED_GAME_ROOM(FORBIDDEN, false, "FB003", "진행 중인 게임입니다."),
	E403_NOT_MY_TURN(FORBIDDEN, false, "FB004", "차례가 아닙니다."),
	E403_OVER_MAX_GAME_ROOM_CNT(FORBIDDEN, false, "FB004", "생성 가능한 최대 개수를 초과했습니다."),
	E403_FORBIDDEN_BAN_NOT_GAME_ROOM_MANAGER(FORBIDDEN, false, "FB005", "방장만 강제 퇴장을 요청할 수 있습니다."),
	E403_FORBIDDEN_START_NOT_GAME_ROOM_MANAGER(FORBIDDEN, false, "FB006", "방장만 게임 시작을 요청할 수 있습니다."),
	E403_ALREADY_FRIEND(FORBIDDEN, false, "FB007", "이미 친구입니다."),
	E403_ALREADY_SENT_FRIEND_REQUEST(FORBIDDEN, false, "FB008", "대기 중인 친구 신청 요청입니다."),
	E403_ALREADY_FULL_SPECTATE_ROOM(FORBIDDEN, false, "FB009", "인원 수가 초과했습니다."),
	E403_FORBIDDEN_ALREADY_IN_GAME_ROOM(FORBIDDEN, false, "FB010", "이미 특정 방에 입장한 상태입니다."),

	/**
	 * 404 Not Found (존재하지 않는 리소스)
	 */
	E404_NOT_EXISTS(NOT_FOUND, false, "NF000", "존재하지 않습니다"),
	E404_NOT_EXISTS_MEMBER(NOT_FOUND, false, "NF001", "탈퇴하거나 존재하지 않는 회원입니다"),
	E404_NOT_EXISTS_FAQ(NOT_FOUND, false, "NF005", "삭제되거나 존재하지 않는 FAQ입니다"),

	/**
	 * 405 Method Not Allowed
	 */
	E405_METHOD_NOT_ALLOWED(METHOD_NOT_ALLOWED, false, "MN000", "허용되지 않은 HTTP 메소드입니다"),

	/**
	 * 406 Not Acceptable
	 */
	E406_NOT_ACCEPTABLE(NOT_ACCEPTABLE, false, "NA000", "허용되지 않은 Content-Type 입니다"),

	/**
	 * 409 Conflict (중복되는 리소스)
	 */
	E409_DUPLICATE(CONFLICT, false, "CF000", "이미 존재합니다"),
	E409_DUPLICATE_NICKNAME(CONFLICT, false, "CF001", "이미 사용중인 닉네임입니다.\n다른 닉네임을 이용해주세요"),
	E409_DUPLICATE_MEMBER(CONFLICT, false, "CF002", "이미 회원가입하셨습니다.\n해당 계정으로 로그인 해주세요"),
	E409_ALREADY_CONNECTED_SOCIAL(CONFLICT, false, "CF004", "이미 소셜 계정에 연결된 회원입니다"),
	E409_DUPLICATE_ROOM_TITLE(CONFLICT, false, "CF005", "이미 사용중인 방제목 입니다."),

	/**
	 * 415 Unsupported Media Type
	 */
	E415_UNSUPPORTED_MEDIA_TYPE(UNSUPPORTED_MEDIA_TYPE, false, "UM000", "지원 하지 않는 MediaType 입니다/"),

	/**
	 * 429 Too Many Requests (RateLimit)
	 */
	E429_TOO_MANY_REQUESTS(TOO_MANY_REQUESTS, true, "TM000", "일시적으로 많은 요청이 들어왔습니다\n잠시후 다시 이용해주세요"),

	/**
	 * 500 Internal Server Exception (서버 내부 에러)
	 */
	E500_INTERNAL_SERVER(INTERNAL_SERVER_ERROR, true, "IS000", "예상치 못한 에러가 발생하였습니다\n잠시 후 다시 시도해주세요!"),

	/**
	 * 501 Not Implemented (현재 지원하지 않는 요청)
	 */
	E501_NOT_SUPPORTED(NOT_IMPLEMENTED, false, "II000", "지원하지 않는 요청입니다"),
	E501_NOT_SUPPORTED_UPLOAD_FILE(NOT_IMPLEMENTED, false, "II001", "해당 서비스에서 업로드할 수 없는 파일 타입 입니다"),

	/**
	 * 502 Bad Gateway (외부 시스템의 Bad Gateway)
	 */
	E502_BAD_GATEWAY(BAD_GATEWAY, true, "BG000", "일시적인 에러가 발생하였습니다\n잠시 후 다시 시도해주세요!"),

	/**
	 * 503 Service UnAvailable
	 */
	E503_SERVICE_UNAVAILABLE(SERVICE_UNAVAILABLE, false, "SU000", "해당 기능은 현재 사용할 수 없습니다"),
	E503_SERVICE_UNAVAILABLE_UNDER_INSPECTION(SERVICE_UNAVAILABLE, false, "SU001", "현재 점검중인 기능입니다\n불편을 드려 죄송합니다!"),
	;

	private final HttpStatusCode statusCode;
	private final boolean sendNotification;
	private final String code;
	private final String message;

	ErrorBase(HttpStatusCode statusCode, boolean sendNotification, String code, String message) {
		this.statusCode = statusCode;
		this.sendNotification = sendNotification;
		this.code = code;
		this.message = message;
	}

	public int getStatus() {
		return statusCode.value();
	}
}