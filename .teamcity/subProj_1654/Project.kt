package subProj_1654

import subProj_1654.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1654")
    name = "subProj 1654"

    buildType(subProj_bt_1654_1)
    buildType(subProj_bt_1654_0)
    buildType(subProj_bt_1654_3)
    buildType(subProj_bt_1654_2)
    buildType(subProj_bt_1654_5)
    buildType(subProj_bt_1654_4)
})
