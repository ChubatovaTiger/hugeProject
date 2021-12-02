package subProj_635

import subProj_635.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_635")
    name = "subProj 635"

    buildType(subProj_bt_635_5)
    buildType(subProj_bt_635_4)
    buildType(subProj_bt_635_1)
    buildType(subProj_bt_635_0)
    buildType(subProj_bt_635_3)
    buildType(subProj_bt_635_2)
})
