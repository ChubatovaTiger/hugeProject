package subProj_1329

import subProj_1329.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1329")
    name = "subProj 1329"

    buildType(subProj_bt_1329_5)
    buildType(subProj_bt_1329_3)
    buildType(subProj_bt_1329_4)
    buildType(subProj_bt_1329_1)
    buildType(subProj_bt_1329_2)
    buildType(subProj_bt_1329_0)
})
