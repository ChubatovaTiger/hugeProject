package subProj_432

import subProj_432.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_432")
    name = "subProj 432"

    buildType(subProj_bt_432_2)
    buildType(subProj_bt_432_1)
    buildType(subProj_bt_432_4)
    buildType(subProj_bt_432_3)
    buildType(subProj_bt_432_5)
    buildType(subProj_bt_432_0)
})
