package subProj_38

import subProj_38.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_38")
    name = "subProj 38"

    buildType(subProj_bt_38_5)
    buildType(subProj_bt_38_0)
    buildType(subProj_bt_38_1)
    buildType(subProj_bt_38_2)
    buildType(subProj_bt_38_3)
    buildType(subProj_bt_38_4)
})
