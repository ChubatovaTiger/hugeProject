package subProj_18

import subProj_18.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_18")
    name = "subProj 18"

    buildType(subProj_bt_18_2)
    buildType(subProj_bt_18_1)
    buildType(subProj_bt_18_0)
    buildType(subProj_bt_18_5)
    buildType(subProj_bt_18_4)
    buildType(subProj_bt_18_3)
})
