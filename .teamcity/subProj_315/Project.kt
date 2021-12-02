package subProj_315

import subProj_315.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_315")
    name = "subProj 315"

    buildType(subProj_bt_315_0)
    buildType(subProj_bt_315_3)
    buildType(subProj_bt_315_4)
    buildType(subProj_bt_315_1)
    buildType(subProj_bt_315_2)
    buildType(subProj_bt_315_5)
})
