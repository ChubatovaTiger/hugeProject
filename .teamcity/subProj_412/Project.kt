package subProj_412

import subProj_412.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_412")
    name = "subProj 412"

    buildType(subProj_bt_412_0)
    buildType(subProj_bt_412_1)
    buildType(subProj_bt_412_2)
    buildType(subProj_bt_412_3)
    buildType(subProj_bt_412_4)
    buildType(subProj_bt_412_5)
})
