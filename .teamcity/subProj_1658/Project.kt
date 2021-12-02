package subProj_1658

import subProj_1658.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1658")
    name = "subProj 1658"

    buildType(subProj_bt_1658_3)
    buildType(subProj_bt_1658_2)
    buildType(subProj_bt_1658_5)
    buildType(subProj_bt_1658_4)
    buildType(subProj_bt_1658_1)
    buildType(subProj_bt_1658_0)
})
