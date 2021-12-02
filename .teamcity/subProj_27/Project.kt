package subProj_27

import subProj_27.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_27")
    name = "subProj 27"

    buildType(subProj_bt_27_5)
    buildType(subProj_bt_27_0)
    buildType(subProj_bt_27_1)
    buildType(subProj_bt_27_2)
    buildType(subProj_bt_27_3)
    buildType(subProj_bt_27_4)
})
