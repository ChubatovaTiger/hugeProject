package subProj_1301

import subProj_1301.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1301")
    name = "subProj 1301"

    buildType(subProj_bt_1301_4)
    buildType(subProj_bt_1301_3)
    buildType(subProj_bt_1301_5)
    buildType(subProj_bt_1301_0)
    buildType(subProj_bt_1301_2)
    buildType(subProj_bt_1301_1)
})
