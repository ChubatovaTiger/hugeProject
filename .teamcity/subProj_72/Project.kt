package subProj_72

import subProj_72.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_72")
    name = "subProj 72"

    buildType(subProj_bt_72_1)
    buildType(subProj_bt_72_2)
    buildType(subProj_bt_72_0)
    buildType(subProj_bt_72_5)
    buildType(subProj_bt_72_3)
    buildType(subProj_bt_72_4)
})
