package subProj_754

import subProj_754.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_754")
    name = "subProj 754"

    buildType(subProj_bt_754_2)
    buildType(subProj_bt_754_3)
    buildType(subProj_bt_754_4)
    buildType(subProj_bt_754_5)
    buildType(subProj_bt_754_0)
    buildType(subProj_bt_754_1)
})
