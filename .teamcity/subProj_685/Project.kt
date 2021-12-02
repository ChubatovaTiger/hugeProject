package subProj_685

import subProj_685.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_685")
    name = "subProj 685"

    buildType(subProj_bt_685_1)
    buildType(subProj_bt_685_2)
    buildType(subProj_bt_685_3)
    buildType(subProj_bt_685_4)
    buildType(subProj_bt_685_5)
    buildType(subProj_bt_685_0)
})
