package subProj_178

import subProj_178.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_178")
    name = "subProj 178"

    buildType(subProj_bt_178_1)
    buildType(subProj_bt_178_0)
    buildType(subProj_bt_178_3)
    buildType(subProj_bt_178_2)
    buildType(subProj_bt_178_5)
    buildType(subProj_bt_178_4)
})
