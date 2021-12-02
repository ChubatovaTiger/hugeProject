package subProj_1197

import subProj_1197.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1197")
    name = "subProj 1197"

    buildType(subProj_bt_1197_5)
    buildType(subProj_bt_1197_4)
    buildType(subProj_bt_1197_1)
    buildType(subProj_bt_1197_0)
    buildType(subProj_bt_1197_3)
    buildType(subProj_bt_1197_2)
})
