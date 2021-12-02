package subProj_1635

import subProj_1635.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1635")
    name = "subProj 1635"

    buildType(subProj_bt_1635_3)
    buildType(subProj_bt_1635_4)
    buildType(subProj_bt_1635_5)
    buildType(subProj_bt_1635_0)
    buildType(subProj_bt_1635_1)
    buildType(subProj_bt_1635_2)
})
