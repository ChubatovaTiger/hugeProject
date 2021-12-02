package subProj_99

import subProj_99.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_99")
    name = "subProj 99"

    buildType(subProj_bt_99_1)
    buildType(subProj_bt_99_0)
    buildType(subProj_bt_99_5)
    buildType(subProj_bt_99_4)
    buildType(subProj_bt_99_3)
    buildType(subProj_bt_99_2)
})
