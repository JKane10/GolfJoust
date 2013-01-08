package com.vpm.golfjoust.util;

public class WebServiceErrorCodes {
		public static final int NoError = 0;
		public static final int NoDataEntry = -1001;
		public static final int InvalidData = -1002;
		public static final int InvalidUsernameOrPassword = -1003;
		public static final int UnableToSubmitChanges = -1004;
	    public static final int UnableToConnectToDb = -1005;
	    public static final int UnableToReadFromDb = -1006;
	    public static final int AuthenticationFailed = -1007;
	    public static final int InvalidToken = -1008;
	    public static final int UnknownDbError = -1009;
	    public static final int InconsistentDbData = -1010;
	    public static final int InconsistentTokenDbData = -1011;
	    public static final int FacebookApiError = -1012;
	    public static final int FacebookTokenInvalid = -1013;
	    public static final int NotEnoughDataInDb = -1014;
	    public static final int InvalidPassKey = -1015;
	    public static final int TwitterApiError = -1016;
	    public static final int TwitterTokenInvalid = -1017;
	    public static final int TwitterSendEmail = -1018;
	    public static final int LinkedinTokenInvalid = -1019;
	    public static final int LinkedinSendEmail = -1020;
	    public static final int PreSignUpUser = -1021;
	    public static final int SendConfirmationMail = -1022;
	    public static final int ConfirmationLinkNotFound = - 1023; 
	    public static final int ConfirmationLinkExpired = -1024;
	    public static final int ConfirmationLinkRejected = -1025;
	    public static final int ConfirmationLinkRejecing = -1026;
	    public static final int ConfirmationLinkAlreadyConfirmed = -1027;
	    public static final int UserAlreadySignedUp = -1028;
	    public static final int CheckConfirmationLink = -1029;
	    public static final int FacebookIdGolferNotFound = -1030;
	    public static final int TwitterIdGolferNotFound = -1031;
	    public static final int LinkedInGolferNotFound = -1032;
	    public static final int GolferNotFound = -1033;

	    public static final int FriendHasDeletedYou = -2001;
	    public static final int EmailAlreadyInUse = -2002;
	    public static final int UnknownGolferId = -2003;

	    public static final int GameInProgress = -3001;
	    public static final int GameDns = -3002;
	    public static final int RequestApproved = -3003;
	    public static final int RequestPendingForApproval = -3004;
	    public static final int RequestRejected = -3005;
	    public static final int GolferNotCreatorOfGame = -3006;
	    public static final int UnknownGolferInGameEntry = -3007;
	    public static final int NonExistingHoleForGolfCourse = -3008;
	    public static final int GolferNotInGame = -3009;
	    public static final int NoOpponentInGame = -3010;
	    public static final int UnknownGame = -3011;
	    public static final int NoScoresEntered = -3012;
	    public static final int InvalidNumberOfHoles = -3013;
	    public static final int UnknownGolferInGame = -3014;
	    public static final int NoFinishedGames = -3015;
	    public static final int NoGolferInGame = -3016;
	    public static final int NoUnfinishedGames = -3017;
	    
	    public static final int DealAlreadyAccepted = -4001;

	    public static final int UnknownGolfCourseId = -5001;

	    public static final int NotImplemented = -9998;
	    public static final int UnknownError =-9999;

	    public static final int EmptyResponseBody = -10000;
}
