package subProj_1455

import subProj_1455.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1455")
    name = "subProj 1455"

    buildType(subProj_bt_1455_4)
    buildType(subProj_bt_1455_3)
    buildType(subProj_bt_1455_5)
    buildType(subProj_bt_1455_0)
    buildType(subProj_bt_1455_2)
    buildType(subProj_bt_1455_1)
})
