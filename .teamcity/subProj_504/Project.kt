package subProj_504

import subProj_504.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_504")
    name = "subProj 504"

    buildType(subProj_bt_504_5)
    buildType(subProj_bt_504_3)
    buildType(subProj_bt_504_4)
    buildType(subProj_bt_504_1)
    buildType(subProj_bt_504_2)
    buildType(subProj_bt_504_0)
})
