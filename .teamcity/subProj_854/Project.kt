package subProj_854

import subProj_854.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_854")
    name = "subProj 854"

    buildType(subProj_bt_854_5)
    buildType(subProj_bt_854_0)
    buildType(subProj_bt_854_4)
    buildType(subProj_bt_854_3)
    buildType(subProj_bt_854_2)
    buildType(subProj_bt_854_1)
})
