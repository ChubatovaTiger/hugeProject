package subProj_851

import subProj_851.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_851")
    name = "subProj 851"

    buildType(subProj_bt_851_2)
    buildType(subProj_bt_851_3)
    buildType(subProj_bt_851_0)
    buildType(subProj_bt_851_1)
    buildType(subProj_bt_851_4)
    buildType(subProj_bt_851_5)
})
