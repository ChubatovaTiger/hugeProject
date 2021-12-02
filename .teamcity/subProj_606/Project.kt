package subProj_606

import subProj_606.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_606")
    name = "subProj 606"

    buildType(subProj_bt_606_4)
    buildType(subProj_bt_606_5)
    buildType(subProj_bt_606_0)
    buildType(subProj_bt_606_1)
    buildType(subProj_bt_606_2)
    buildType(subProj_bt_606_3)
})
