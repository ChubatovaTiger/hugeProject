package subProj_183

import subProj_183.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_183")
    name = "subProj 183"

    buildType(subProj_bt_183_1)
    buildType(subProj_bt_183_0)
    buildType(subProj_bt_183_3)
    buildType(subProj_bt_183_2)
    buildType(subProj_bt_183_5)
    buildType(subProj_bt_183_4)
})
