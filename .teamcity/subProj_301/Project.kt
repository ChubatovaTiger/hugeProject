package subProj_301

import subProj_301.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_301")
    name = "subProj 301"

    buildType(subProj_bt_301_2)
    buildType(subProj_bt_301_3)
    buildType(subProj_bt_301_0)
    buildType(subProj_bt_301_1)
    buildType(subProj_bt_301_4)
    buildType(subProj_bt_301_5)
})
