package subProj_899

import subProj_899.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_899")
    name = "subProj 899"

    buildType(subProj_bt_899_4)
    buildType(subProj_bt_899_5)
    buildType(subProj_bt_899_0)
    buildType(subProj_bt_899_1)
    buildType(subProj_bt_899_2)
    buildType(subProj_bt_899_3)
})
