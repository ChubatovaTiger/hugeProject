package subProj_500

import subProj_500.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_500")
    name = "subProj 500"

    buildType(subProj_bt_500_5)
    buildType(subProj_bt_500_3)
    buildType(subProj_bt_500_4)
    buildType(subProj_bt_500_1)
    buildType(subProj_bt_500_2)
    buildType(subProj_bt_500_0)
})
