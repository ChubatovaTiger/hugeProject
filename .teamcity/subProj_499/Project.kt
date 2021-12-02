package subProj_499

import subProj_499.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_499")
    name = "subProj 499"

    buildType(subProj_bt_499_4)
    buildType(subProj_bt_499_5)
    buildType(subProj_bt_499_0)
    buildType(subProj_bt_499_1)
    buildType(subProj_bt_499_2)
    buildType(subProj_bt_499_3)
})
