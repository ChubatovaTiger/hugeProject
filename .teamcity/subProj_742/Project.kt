package subProj_742

import subProj_742.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_742")
    name = "subProj 742"

    buildType(subProj_bt_742_3)
    buildType(subProj_bt_742_4)
    buildType(subProj_bt_742_5)
    buildType(subProj_bt_742_0)
    buildType(subProj_bt_742_1)
    buildType(subProj_bt_742_2)
})
