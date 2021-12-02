package subProj_1198

import subProj_1198.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1198")
    name = "subProj 1198"

    buildType(subProj_bt_1198_4)
    buildType(subProj_bt_1198_3)
    buildType(subProj_bt_1198_5)
    buildType(subProj_bt_1198_0)
    buildType(subProj_bt_1198_2)
    buildType(subProj_bt_1198_1)
})
