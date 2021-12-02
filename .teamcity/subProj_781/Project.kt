package subProj_781

import subProj_781.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_781")
    name = "subProj 781"

    buildType(subProj_bt_781_2)
    buildType(subProj_bt_781_3)
    buildType(subProj_bt_781_0)
    buildType(subProj_bt_781_1)
    buildType(subProj_bt_781_4)
    buildType(subProj_bt_781_5)
})
