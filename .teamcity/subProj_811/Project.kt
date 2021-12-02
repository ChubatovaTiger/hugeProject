package subProj_811

import subProj_811.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_811")
    name = "subProj 811"

    buildType(subProj_bt_811_5)
    buildType(subProj_bt_811_4)
    buildType(subProj_bt_811_1)
    buildType(subProj_bt_811_0)
    buildType(subProj_bt_811_3)
    buildType(subProj_bt_811_2)
})
