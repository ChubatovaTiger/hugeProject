package subProj_188

import subProj_188.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_188")
    name = "subProj 188"

    buildType(subProj_bt_188_0)
    buildType(subProj_bt_188_2)
    buildType(subProj_bt_188_1)
    buildType(subProj_bt_188_4)
    buildType(subProj_bt_188_3)
    buildType(subProj_bt_188_5)
})
