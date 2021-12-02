package subProj_1921

import subProj_1921.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1921")
    name = "subProj 1921"

    buildType(subProj_bt_1921_1)
    buildType(subProj_bt_1921_2)
    buildType(subProj_bt_1921_0)
    buildType(subProj_bt_1921_5)
    buildType(subProj_bt_1921_3)
    buildType(subProj_bt_1921_4)
})
