package subProj_1182

import subProj_1182.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1182")
    name = "subProj 1182"

    buildType(subProj_bt_1182_4)
    buildType(subProj_bt_1182_5)
    buildType(subProj_bt_1182_0)
    buildType(subProj_bt_1182_1)
    buildType(subProj_bt_1182_2)
    buildType(subProj_bt_1182_3)
})
