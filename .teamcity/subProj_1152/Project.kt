package subProj_1152

import subProj_1152.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1152")
    name = "subProj 1152"

    buildType(subProj_bt_1152_5)
    buildType(subProj_bt_1152_0)
    buildType(subProj_bt_1152_4)
    buildType(subProj_bt_1152_3)
    buildType(subProj_bt_1152_2)
    buildType(subProj_bt_1152_1)
})
