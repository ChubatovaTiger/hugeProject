package subProj_1049

import subProj_1049.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1049")
    name = "subProj 1049"

    buildType(subProj_bt_1049_2)
    buildType(subProj_bt_1049_3)
    buildType(subProj_bt_1049_4)
    buildType(subProj_bt_1049_5)
    buildType(subProj_bt_1049_0)
    buildType(subProj_bt_1049_1)
})
