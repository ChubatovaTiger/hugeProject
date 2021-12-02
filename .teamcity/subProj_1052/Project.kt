package subProj_1052

import subProj_1052.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1052")
    name = "subProj 1052"

    buildType(subProj_bt_1052_3)
    buildType(subProj_bt_1052_2)
    buildType(subProj_bt_1052_5)
    buildType(subProj_bt_1052_4)
    buildType(subProj_bt_1052_1)
    buildType(subProj_bt_1052_0)
})
