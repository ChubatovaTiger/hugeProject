package subProj_482

import subProj_482.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_482")
    name = "subProj 482"

    buildType(subProj_bt_482_1)
    buildType(subProj_bt_482_0)
    buildType(subProj_bt_482_5)
    buildType(subProj_bt_482_4)
    buildType(subProj_bt_482_3)
    buildType(subProj_bt_482_2)
})
