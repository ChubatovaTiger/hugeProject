package subProj_1549

import subProj_1549.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1549")
    name = "subProj 1549"

    buildType(subProj_bt_1549_4)
    buildType(subProj_bt_1549_3)
    buildType(subProj_bt_1549_2)
    buildType(subProj_bt_1549_1)
    buildType(subProj_bt_1549_5)
    buildType(subProj_bt_1549_0)
})
