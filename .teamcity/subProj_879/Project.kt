package subProj_879

import subProj_879.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_879")
    name = "subProj 879"

    buildType(subProj_bt_879_2)
    buildType(subProj_bt_879_3)
    buildType(subProj_bt_879_4)
    buildType(subProj_bt_879_5)
    buildType(subProj_bt_879_0)
    buildType(subProj_bt_879_1)
})
