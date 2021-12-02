package subProj_1577

import subProj_1577.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1577")
    name = "subProj 1577"

    buildType(subProj_bt_1577_2)
    buildType(subProj_bt_1577_3)
    buildType(subProj_bt_1577_4)
    buildType(subProj_bt_1577_5)
    buildType(subProj_bt_1577_0)
    buildType(subProj_bt_1577_1)
})
