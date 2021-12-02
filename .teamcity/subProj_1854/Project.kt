package subProj_1854

import subProj_1854.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1854")
    name = "subProj 1854"

    buildType(subProj_bt_1854_1)
    buildType(subProj_bt_1854_0)
    buildType(subProj_bt_1854_3)
    buildType(subProj_bt_1854_2)
    buildType(subProj_bt_1854_5)
    buildType(subProj_bt_1854_4)
})
