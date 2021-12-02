package subProj_291

import subProj_291.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_291")
    name = "subProj 291"

    buildType(subProj_bt_291_2)
    buildType(subProj_bt_291_3)
    buildType(subProj_bt_291_4)
    buildType(subProj_bt_291_5)
    buildType(subProj_bt_291_0)
    buildType(subProj_bt_291_1)
})
