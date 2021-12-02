package subProj_1634

import subProj_1634.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1634")
    name = "subProj 1634"

    buildType(subProj_bt_1634_4)
    buildType(subProj_bt_1634_5)
    buildType(subProj_bt_1634_0)
    buildType(subProj_bt_1634_1)
    buildType(subProj_bt_1634_2)
    buildType(subProj_bt_1634_3)
})
