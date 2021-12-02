package subProj_1617

import subProj_1617.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1617")
    name = "subProj 1617"

    buildType(subProj_bt_1617_5)
    buildType(subProj_bt_1617_4)
    buildType(subProj_bt_1617_3)
    buildType(subProj_bt_1617_2)
    buildType(subProj_bt_1617_1)
    buildType(subProj_bt_1617_0)
})
