package subProj_607

import subProj_607.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_607")
    name = "subProj 607"

    buildType(subProj_bt_607_3)
    buildType(subProj_bt_607_4)
    buildType(subProj_bt_607_5)
    buildType(subProj_bt_607_0)
    buildType(subProj_bt_607_1)
    buildType(subProj_bt_607_2)
})
