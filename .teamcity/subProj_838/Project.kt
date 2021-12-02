package subProj_838

import subProj_838.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_838")
    name = "subProj 838"

    buildType(subProj_bt_838_1)
    buildType(subProj_bt_838_2)
    buildType(subProj_bt_838_0)
    buildType(subProj_bt_838_5)
    buildType(subProj_bt_838_3)
    buildType(subProj_bt_838_4)
})
