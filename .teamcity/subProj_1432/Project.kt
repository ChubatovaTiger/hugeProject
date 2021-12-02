package subProj_1432

import subProj_1432.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1432")
    name = "subProj 1432"

    buildType(subProj_bt_1432_4)
    buildType(subProj_bt_1432_5)
    buildType(subProj_bt_1432_0)
    buildType(subProj_bt_1432_1)
    buildType(subProj_bt_1432_2)
    buildType(subProj_bt_1432_3)
})
