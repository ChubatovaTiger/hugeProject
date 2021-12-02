package subProj_714

import subProj_714.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_714")
    name = "subProj 714"

    buildType(subProj_bt_714_5)
    buildType(subProj_bt_714_4)
    buildType(subProj_bt_714_3)
    buildType(subProj_bt_714_2)
    buildType(subProj_bt_714_1)
    buildType(subProj_bt_714_0)
})
