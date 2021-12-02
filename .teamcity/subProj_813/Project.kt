package subProj_813

import subProj_813.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_813")
    name = "subProj 813"

    buildType(subProj_bt_813_3)
    buildType(subProj_bt_813_2)
    buildType(subProj_bt_813_5)
    buildType(subProj_bt_813_4)
    buildType(subProj_bt_813_1)
    buildType(subProj_bt_813_0)
})
