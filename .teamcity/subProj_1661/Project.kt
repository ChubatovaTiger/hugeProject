package subProj_1661

import subProj_1661.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1661")
    name = "subProj 1661"

    buildType(subProj_bt_1661_0)
    buildType(subProj_bt_1661_1)
    buildType(subProj_bt_1661_4)
    buildType(subProj_bt_1661_5)
    buildType(subProj_bt_1661_2)
    buildType(subProj_bt_1661_3)
})
