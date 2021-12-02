package subProj_1754

import subProj_1754.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1754")
    name = "subProj 1754"

    buildType(subProj_bt_1754_4)
    buildType(subProj_bt_1754_3)
    buildType(subProj_bt_1754_2)
    buildType(subProj_bt_1754_1)
    buildType(subProj_bt_1754_0)
    buildType(subProj_bt_1754_5)
})
